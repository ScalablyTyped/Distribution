package typings.reactMdTransition.typesTypesMod

import typings.reactMdTransition.anon.ReadonlyCSSTransitionClas
import typings.reactMdTransition.anon.ReadonlyTransitionTimeout
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CSSTransitionClassNames = String | ReadonlyCSSTransitionClas

type TransitionEnterHandler = js.Function1[/* appearing */ Boolean, Unit]

type TransitionExitHandler = js.Function0[Unit]

type TransitionScrollCallback[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */] = js.Function2[
/* event */ Event, 
/* data */ FixedPositioningScrollData[FixedToElement, FixedElement], 
Unit]

type TransitionTimeout = Double | ReadonlyTransitionTimeout
