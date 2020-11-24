package typings.psi.mod

import typings.psi.psiStrings.desktop
import typings.psi.psiStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * When using this module for a production-level build process,
    * registering for an API key from the Google Developer Console is recommended.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Locale results should be generated in.
    * @default 'en_US'
    */
  var locale: js.UndefOr[String] = js.native
  
  var nokey: js.UndefOr[String] = js.native
  
  /**
    * Strategy to use when analyzing the page.
    * @default 'mobile'
    */
  var strategy: js.UndefOr[mobile | desktop] = js.native
  
  /**
    * Threshold score to pass the PageSpeed test. Useful for setting a performance budget.
    * @default 70
    */
  var treshold: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNokey(value: String): Self = this.set("nokey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNokey: Self = this.set("nokey", js.undefined)
    
    @scala.inline
    def setStrategy(value: mobile | desktop): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setTreshold(value: Double): Self = this.set("treshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreshold: Self = this.set("treshold", js.undefined)
  }
}
