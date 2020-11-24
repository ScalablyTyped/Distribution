package typings.rcSelect

import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /** This is a placeholder, not real render in dom */
  val OptGroup: OptionGroupFC = js.native
  
  /** This is a placeholder, not real render in dom */
  val Option: OptionFC = js.native
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  class default[VT] ()
    extends typings.rcSelect.selectMod.default[VT]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var OptGroup: OptionGroupFC = js.native
    
    var Option: OptionFC = js.native
  }
}
