package typings.snabbdom.jsxGlobalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * opt-in jsx intrinsic global interfaces
    * see: https://www.typescriptlang.org/docs/handbook/jsx.html#type-checking
    */
  @js.native
  object JSX extends js.Object {
    
    type Element = VNode
    
    type IntrinsicElements = StringDictionary[VNodeData]
  }
}
