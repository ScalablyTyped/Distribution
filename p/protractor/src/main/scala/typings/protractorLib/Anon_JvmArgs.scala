package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JvmArgs extends js.Object {
  /**
    * Additional command line options to pass to selenium. For example,
    * if you need to change the browser timeout, use
    * seleniumArgs: ['-browserTimeout=60']
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /**
    * Additional command line jvm options to pass to selenium. For example,
    * if you need to change the browser driver, use
    * jvmArgs: ['-Dwebdriver.ie.driver=IEDriverServer_Win32_2.53.1.exe']
    */
  var jvmArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

