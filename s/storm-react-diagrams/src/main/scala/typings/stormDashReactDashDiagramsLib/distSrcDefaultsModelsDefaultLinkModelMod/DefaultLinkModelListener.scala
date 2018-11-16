package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLinkModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefaultLinkModelListener
  extends stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener {
  var colorChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_Color, 
      scala.Unit
    ]
  ] = js.undefined
  var widthChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_Width, 
      scala.Unit
    ]
  ] = js.undefined
}

