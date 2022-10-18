package typings.refractor

import typings.hast.mod.Properties
import typings.hast.mod.Root
import typings.refractor.libCoreMod.Refractor_
import typings.refractor.refractorStrings.element
import typings.refractor.refractorStrings.root
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonMod {
  
  @JSImport("refractor/lib/common", "refractor")
  @js.native
  val refractor: Refractor_ = js.native
  
  type Grammar = typings.refractor.libCoreMod.Grammar
  
  /* Inlined refractor.refractor/lib/core.RefractorElement */
  trait RefractorElement extends StObject {
    
    var children: js.Array[
        typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
      ]
    
    var content: js.UndefOr[Root] = js.undefined
    
    var data: js.UndefOr[NodeData[Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var properties: js.UndefOr[Properties] = js.undefined
    
    var tagName: String
    
    var `type`: element
  }
  object RefractorElement {
    
    inline def apply(
      children: js.Array[
          typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
        ],
      tagName: String
    ): RefractorElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[RefractorElement]
    }
    
    extension [Self <: RefractorElement](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: Root): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: NodeData[Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined refractor.refractor/lib/core.RefractorRoot */
  trait RefractorRoot extends StObject {
    
    var children: js.Array[
        typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
      ]
    
    var data: js.UndefOr[NodeData[Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: root
  }
  object RefractorRoot {
    
    inline def apply(
      children: js.Array[
          typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
        ]
    ): RefractorRoot = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[RefractorRoot]
    }
    
    extension [Self <: RefractorRoot](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (typings.refractor.libCoreMod.RefractorElement | typings.refractor.libCoreMod.Text)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: NodeData[Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Syntax = typings.refractor.libCoreMod.Syntax
  
  type Text = typings.refractor.libCoreMod.Text
}
