package typings.shortCssVars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional configurations
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Custom formatter
    */
  var formatter: js.UndefOr[CustomFormatter] = js.native
  
  /**
    * Rule to ignore certain variable names
    */
  var ignore: js.UndefOr[IgnoreType] = js.native
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
    def setFormatter(value: /* name */ String => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setIgnoreFunction1(value: /* name */ String => Boolean): Self = this.set("ignore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnore(value: IgnoreType): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
  }
}
