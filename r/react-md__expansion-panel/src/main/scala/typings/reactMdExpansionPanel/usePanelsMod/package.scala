package typings.reactMdExpansionPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object usePanelsMod {
  
  type CreateExpandById = js.Function1[/* panelId */ java.lang.String, js.Function0[scala.Unit]]
  
  type ExpandedIds = js.Array[java.lang.String]
  
  type ExpansionDispatcher = typings.react.mod.Dispatch[
    typings.react.mod.SetStateAction[typings.reactMdExpansionPanel.usePanelsMod.ExpandedIds]
  ]
  
  type ExpansionPanelKeyDownHandler = typings.react.mod.KeyboardEventHandler[typings.std.HTMLDivElement]
  
  type ReturnValue = js.Tuple5[
    js.Array[typings.reactMdExpansionPanel.usePanelsMod.ProvidedPanelProps], 
    typings.reactMdExpansionPanel.usePanelsMod.ExpansionPanelKeyDownHandler, 
    typings.reactMdExpansionPanel.usePanelsMod.ExpandedIds, 
    typings.reactMdExpansionPanel.usePanelsMod.ExpansionDispatcher, 
    typings.reactMdExpansionPanel.usePanelsMod.CreateExpandById
  ]
}
