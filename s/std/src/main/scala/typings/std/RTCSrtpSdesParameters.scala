package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpSdesParameters extends js.Object {
  
  var cryptoSuite: js.UndefOr[java.lang.String] = js.native
  
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.native
  
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var tag: js.UndefOr[Double] = js.native
}
object RTCSrtpSdesParameters {
  
  @scala.inline
  def apply(): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
  
  @scala.inline
  implicit class RTCSrtpSdesParametersOps[Self <: RTCSrtpSdesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCryptoSuite(value: java.lang.String): Self = this.set("cryptoSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoSuite: Self = this.set("cryptoSuite", js.undefined)
    
    @scala.inline
    def setKeyParamsVarargs(value: RTCSrtpKeyParam*): Self = this.set("keyParams", js.Array(value :_*))
    
    @scala.inline
    def setKeyParams(value: js.Array[RTCSrtpKeyParam]): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", js.undefined)
    
    @scala.inline
    def setSessionParamsVarargs(value: java.lang.String*): Self = this.set("sessionParams", js.Array(value :_*))
    
    @scala.inline
    def setSessionParams(value: js.Array[java.lang.String]): Self = this.set("sessionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionParams: Self = this.set("sessionParams", js.undefined)
    
    @scala.inline
    def setTag(value: Double): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
