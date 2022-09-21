package typings.reactMapGl.mod

import typings.react.mod.Context
import typings.reactMapGl.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MapContext: Context[MapContextProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("_MapContext").asInstanceOf[Context[MapContextProps]]

type ContextViewStateChangeHandler = js.Function1[/* info */ ContextViewStateChangeInfo, Unit]

type ContextViewportChangeHandler = js.Function3[
/* viewState */ ViewportProps, 
/* interactionState */ ExtraState, 
/* oldViewState */ ViewportProps, 
Unit]

type EasingFunction = js.Function1[/* t */ Double, Double]

type EventManager = Any

type SVGRedrawOptions = HTMLRedrawOptions

type ViewStateChangeHandler = js.Function1[/* info */ ViewStateChangeInfo, Unit]

type ViewportChangeHandler = js.Function1[/* viewState */ ViewportProps, Unit]
