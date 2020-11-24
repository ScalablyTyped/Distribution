package typings.reactNativeAws3.mod

import typings.std.Blob
import typings.std.FormData
import typings.std.Parameters
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  var _formData: FormData = js.native
  
  var _promise: js.Promise[Response] = js.native
  
  var _xhr: XMLHttpRequest = js.native
  
  def abort(): this.type = js.native
  
  def `catch`(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<this['_promise']['catch']> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: this['_promise']['catch'] */ js.Any
    ]
  ): this.type = js.native
  
  def header(key: String, value: String): this.type = js.native
  
  def progress(callback: js.Function1[/* progress */ Progress, _]): this.type = js.native
  
  def send(): this.type = js.native
  
  def set(key: String, value: String): this.type = js.native
  def set(key: String, value: Blob): this.type = js.native
  
  def `then`(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<this['_promise']['then']> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: this['_promise']['then'] */ js.Any
    ]
  ): this.type = js.native
}
