package typings.react

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxDevRuntimeMod {
  
  object JSX {
    
    type Element = typings.react.mod.JSX.Element
    
    type ElementAttributesProperty = typings.react.mod.JSX.ElementAttributesProperty
    
    type ElementChildrenAttribute = typings.react.mod.JSX.ElementChildrenAttribute
    
    type ElementClass = typings.react.mod.JSX.ElementClass
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ElementType = react.react.JSX.ElementType
    }}}
    to avoid circular code involving: 
    - react.react.<global>.JSX.ElementType
    - react.react.GlobalJSXElementType
    - react.react.JSX.ElementType
    - react.react.JSXElementConstructor
    - react.react.ReactNode
    - react.react/experimental.react.PromiseLikeOfReactNode
    - react.react/jsx-dev-runtime.JSX.ElementType
    */
    type ElementType = Any
    
    type IntrinsicAttributes = typings.react.mod.JSX.IntrinsicAttributes
    
    type IntrinsicClassAttributes[T] = typings.react.mod.JSX.IntrinsicClassAttributes[T]
    
    type IntrinsicElements = typings.react.mod.JSX.IntrinsicElements
    
    type LibraryManagedAttributes[C, P] = typings.react.mod.JSX.LibraryManagedAttributes[C, P]
  }
}
