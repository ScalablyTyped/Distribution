package typings.reactFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typings.reactFns.typesMod.CompositeComponent[TMergedProps], 
    typings.react.mod.ComponentClass[TOwnProps, typings.react.mod.ComponentState]
  ]
  
  type CompositeComponent[P] = (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[P]
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typings.reactFns.typesMod.CompositeComponent[TOwnProps], 
    typings.reactFns.typesMod.CompositeComponent[TOwnProps]
  ]
}
