package typings.senchaTouch.Ext.device.camera

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IBase {
  
  /** [Method] Allows you to capture a photo
    * @param options Object The options to use when taking a photo.
    * @param scope Object The scope in which to call the success and failure functions, if specified.
    * @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
    * @param encoding String The encoding of the returned image. Available options are:  jpg png
    * @param width Number The width of the image to return
    * @param height Number The height of the image to return
    */
  var capture: js.UndefOr[
    js.Function6[
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* destination */ js.UndefOr[String], 
      /* encoding */ js.UndefOr[String], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}
object IAbstract {
  
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    
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
    def setCapture(
      value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* destination */ js.UndefOr[String], /* encoding */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("capture", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
  }
}
