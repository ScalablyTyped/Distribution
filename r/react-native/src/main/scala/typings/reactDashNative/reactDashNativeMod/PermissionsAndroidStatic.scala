package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsAndroidStatic extends Instantiable0[PermissionsAndroidStatic] {
  /**
    * A list of specified "dangerous" permissions that require prompting the user
    */
  var PERMISSIONS: StringDictionary[Permission] = js.native
  /**
    * A list of permission results that are returned
    */
  var RESULTS: StringDictionary[PermissionStatus] = js.native
  /**
    * Returns a promise resolving to a boolean value as to whether the specified
    * permissions has been granted
    */
  def check(permission: Permission): js.Promise[Boolean] = js.native
  /**
    * @deprecated Use check instead
    */
  def checkPermission(permission: Permission): js.Promise[Boolean] = js.native
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
  def request(permission: Permission): js.Promise[PermissionStatus] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
  /**
    * Prompts the user to enable multiple permissions in the same dialog and
    * returns an object with the permissions as keys and strings as values
    * indicating whether the user allowed or denied the request
    */
  def requestMultiple(permissions: js.Array[Permission]): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native.react-native.Permission ]: react-native.react-native.PermissionStatus}
    */ typings.reactDashNative.reactDashNativeStrings.PermissionsAndroidStatic with js.Any
  ] = js.native
  /**
    * @deprecated Use request instead
    */
  def requestPermission(permission: Permission): js.Promise[Boolean] = js.native
  def requestPermission(permission: Permission, rationale: Rationale): js.Promise[Boolean] = js.native
}

