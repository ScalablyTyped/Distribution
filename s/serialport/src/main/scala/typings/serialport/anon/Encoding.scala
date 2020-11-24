package typings.serialport.anon

import typings.node.Buffer
import typings.serialport.serialportStrings.ascii
import typings.serialport.serialportStrings.base64
import typings.serialport.serialportStrings.binary
import typings.serialport.serialportStrings.hex
import typings.serialport.serialportStrings.ucs2
import typings.serialport.serialportStrings.utf16le
import typings.serialport.serialportStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var delimiter: String | Buffer | js.Array[Double] = js.native
  
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.native
  
  var includeDelimiter: js.UndefOr[Boolean] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): Encoding = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelimiterVarargs(value: Double*): Self = this.set("delimiter", js.Array(value :_*))
    
    @scala.inline
    def setDelimiter(value: String | Buffer | js.Array[Double]): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setIncludeDelimiter(value: Boolean): Self = this.set("includeDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDelimiter: Self = this.set("includeDelimiter", js.undefined)
  }
}
