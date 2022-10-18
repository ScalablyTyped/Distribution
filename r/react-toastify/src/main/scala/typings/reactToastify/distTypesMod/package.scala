package typings.reactToastify.distTypesMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactToastify.anon.DefaultClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Id = Double | String

type ToastClassName = (js.Function1[/* context */ js.UndefOr[DefaultClassName], String]) | String

type ToastContent[T] = ReactNode | (js.Function1[/* props */ ToastContentProps[T], ReactNode])

type ToastTransition = FC[ToastTransitionProps] | (ComponentClass[ToastTransitionProps, ComponentState])
