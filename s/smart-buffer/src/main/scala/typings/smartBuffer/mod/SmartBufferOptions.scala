package typings.smartBuffer.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object interface for constructing new SmartBuffer instances.
  */
@js.native
trait SmartBufferOptions extends js.Object {
  
  var buff: js.UndefOr[Buffer] = js.native
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object SmartBufferOptions {
  
  @scala.inline
  def apply(): SmartBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartBufferOptions]
  }
  
  @scala.inline
  implicit class SmartBufferOptionsOps[Self <: SmartBufferOptions] (val x: Self) extends AnyVal {
    
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
    def setBuff(value: Buffer): Self = this.set("buff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuff: Self = this.set("buff", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
