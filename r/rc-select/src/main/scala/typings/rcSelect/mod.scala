package typings.rcSelect

import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @JSImport("rc-select", JSImport.Default)
  @js.native
  class default[VT] ()
    extends typings.rcSelect.selectMod.default[VT]
  object default {
    
    @JSImport("rc-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof OptGroup` */
    @JSImport("rc-select", "default.OptGroup")
    @js.native
    def OptGroup: OptionGroupFC = js.native
    @scala.inline
    def OptGroup_=(x: OptionGroupFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptGroup")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Option` */
    @JSImport("rc-select", "default.Option")
    @js.native
    def Option: OptionFC = js.native
    @scala.inline
    def Option_=(x: OptionFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "OptGroup")
  @js.native
  val OptGroup: OptionGroupFC = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "Option")
  @js.native
  val Option: OptionFC = js.native
}
