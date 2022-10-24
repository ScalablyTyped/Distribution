package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DragItem = StringDictionary[String]

type DragPreviewRenderer = js.Function2[
/* items */ js.Array[DragItem], 
/* callback */ js.Function1[/* node */ HTMLElement, Unit], 
Unit]
