package typings.rcloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RcLoader extends js.Object {
  
  def `for`(path: String): Unit = js.native
  def `for`(path: String, callback: js.Function2[/* error */ js.Any, /* fileOpts */ js.Any, Unit]): Unit = js.native
}
