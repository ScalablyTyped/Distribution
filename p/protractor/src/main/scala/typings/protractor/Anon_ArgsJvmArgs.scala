package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsJvmArgs extends js.Object {
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
  var jvmArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

object Anon_ArgsJvmArgs {
  @scala.inline
  def apply(args: js.Any = null, jvmArgs: js.Array[String] = null, port: js.Any = null): Anon_ArgsJvmArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (jvmArgs != null) __obj.updateDynamic("jvmArgs")(jvmArgs.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsJvmArgs]
  }
}

