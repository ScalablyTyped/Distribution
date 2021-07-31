package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxGlobalMod {
  
  type VNode = VNode_
  
  type VNodeData = typings.snabbdom.vnodeMod.VNodeData
  
  object global {
    
    /**
      * opt-in jsx intrinsic global interfaces
      * see: https://www.typescriptlang.org/docs/handbook/jsx.html#type-checking
      */
    object JSX {
      
      type Element = VNode
      
      type IntrinsicElements = StringDictionary[VNodeData]
    }
  }
}
