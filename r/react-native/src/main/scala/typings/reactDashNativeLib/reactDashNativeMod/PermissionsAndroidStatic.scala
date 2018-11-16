package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsAndroidStatic
  extends ScalablyTyped.runtime.Instantiable0[PermissionsAndroidStatic] {
  /**
       * A list of specified "dangerous" permissions that require prompting the user
       */
  var PERMISSIONS: ScalablyTyped.runtime.StringDictionary[Permission] = js.native
  /**
       * A list of permission results that are returned
       */
  var RESULTS: ScalablyTyped.runtime.StringDictionary[PermissionStatus] = js.native
  /**
       * Returns a promise resolving to a boolean value as to whether the specified
       * permissions has been granted
       */
  def check(permission: Permission): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Deprecated
       */
  def checkPermission(permission: Permission): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Prompts the user to enable a permission and returns a promise resolving to a
       * string value indicating whether the user allowed or denied the request
       *
       * If the optional rationale argument is included (which is an object with a
       * title and message), this function checks with the OS whether it is necessary
       * to show a dialog explaining why the permission is needed
       * (https://developer.android.com/training/permissions/requesting.html#explain)
       * and then shows the system permission dialog
       */
  def request(permission: Permission): stdLib.Promise[java.lang.String] = js.native
  /**
       * Prompts the user to enable a permission and returns a promise resolving to a
       * string value indicating whether the user allowed or denied the request
       *
       * If the optional rationale argument is included (which is an object with a
       * title and message), this function checks with the OS whether it is necessary
       * to show a dialog explaining why the permission is needed
       * (https://developer.android.com/training/permissions/requesting.html#explain)
       * and then shows the system permission dialog
       */
  def request(permission: Permission, rationale: Rationale): stdLib.Promise[java.lang.String] = js.native
  /**
       * Prompts the user to enable multiple permissions in the same dialog and
       * returns an object with the permissions as keys and strings as values
       * indicating whether the user allowed or denied the request
       */
  def requestMultiple(permissions: js.Array[java.lang.String]): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[PermissionStatus]] = js.native
  /**
       * Deprecated
       */
  def requestPermission(permission: Permission): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Deprecated
       */
  def requestPermission(permission: Permission, rationale: Rationale): stdLib.Promise[scala.Boolean] = js.native
}

