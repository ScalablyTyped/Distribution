package typings.slate

import typings.slate.customTypesMod.ExtendableTypes
import typings.slate.typesMod.LeafEdge
import typings.slate.typesMod.MaximizeMode
import typings.slate.typesMod.MoveUnit
import typings.slate.typesMod.RangeDirection
import typings.slate.typesMod.RangeMode
import typings.slate.typesMod.SelectionEdge
import typings.slate.typesMod.SelectionMode
import typings.slate.typesMod.TextDirection
import typings.slate.typesMod.TextUnit
import typings.slate.typesMod.TextUnitAdjustment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slateStrings {
  
  @js.native
  sealed trait Editor
    extends StObject
       with ExtendableTypes
  inline def Editor: Editor = "Editor".asInstanceOf[Editor]
  
  @js.native
  sealed trait Element
    extends StObject
       with ExtendableTypes
  inline def Element: Element = "Element".asInstanceOf[Element]
  
  @js.native
  sealed trait InsertNodeOperation
    extends StObject
       with ExtendableTypes
  inline def InsertNodeOperation: InsertNodeOperation = "InsertNodeOperation".asInstanceOf[InsertNodeOperation]
  
  @js.native
  sealed trait InsertTextOperation
    extends StObject
       with ExtendableTypes
  inline def InsertTextOperation: InsertTextOperation = "InsertTextOperation".asInstanceOf[InsertTextOperation]
  
  @js.native
  sealed trait MergeNodeOperation
    extends StObject
       with ExtendableTypes
  inline def MergeNodeOperation: MergeNodeOperation = "MergeNodeOperation".asInstanceOf[MergeNodeOperation]
  
  @js.native
  sealed trait MoveNodeOperation
    extends StObject
       with ExtendableTypes
  inline def MoveNodeOperation: MoveNodeOperation = "MoveNodeOperation".asInstanceOf[MoveNodeOperation]
  
  @js.native
  sealed trait Operation
    extends StObject
       with ExtendableTypes
  inline def Operation: Operation = "Operation".asInstanceOf[Operation]
  
  @js.native
  sealed trait Point
    extends StObject
       with ExtendableTypes
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Range
    extends StObject
       with ExtendableTypes
  inline def Range: Range = "Range".asInstanceOf[Range]
  
  @js.native
  sealed trait RemoveNodeOperation
    extends StObject
       with ExtendableTypes
  inline def RemoveNodeOperation: RemoveNodeOperation = "RemoveNodeOperation".asInstanceOf[RemoveNodeOperation]
  
  @js.native
  sealed trait RemoveTextOperation
    extends StObject
       with ExtendableTypes
  inline def RemoveTextOperation: RemoveTextOperation = "RemoveTextOperation".asInstanceOf[RemoveTextOperation]
  
  @js.native
  sealed trait Selection
    extends StObject
       with ExtendableTypes
  inline def Selection: Selection = "Selection".asInstanceOf[Selection]
  
  @js.native
  sealed trait SetNodeOperation
    extends StObject
       with ExtendableTypes
  inline def SetNodeOperation: SetNodeOperation = "SetNodeOperation".asInstanceOf[SetNodeOperation]
  
  @js.native
  sealed trait SetSelectionOperation
    extends StObject
       with ExtendableTypes
  inline def SetSelectionOperation: SetSelectionOperation = "SetSelectionOperation".asInstanceOf[SetSelectionOperation]
  
  @js.native
  sealed trait SplitNodeOperation
    extends StObject
       with ExtendableTypes
  inline def SplitNodeOperation: SplitNodeOperation = "SplitNodeOperation".asInstanceOf[SplitNodeOperation]
  
  @js.native
  sealed trait Text
    extends StObject
       with ExtendableTypes
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait all
    extends StObject
       with MaximizeMode
       with SelectionMode
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait anchor
    extends StObject
       with SelectionEdge
  inline def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait backward
    extends StObject
       with RangeDirection
       with TextDirection
  inline def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait block
    extends StObject
       with TextUnit
       with TextUnitAdjustment
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait character
    extends StObject
       with MoveUnit
       with TextUnit
       with TextUnitAdjustment
  inline def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait children extends StObject
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait end
    extends StObject
       with LeafEdge
       with SelectionEdge
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait focus
    extends StObject
       with SelectionEdge
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait forward
    extends StObject
       with RangeDirection
       with TextDirection
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait highest
    extends StObject
       with MaximizeMode
       with RangeMode
       with SelectionMode
  inline def highest: highest = "highest".asInstanceOf[highest]
  
  @js.native
  sealed trait insert_node extends StObject
  inline def insert_node: insert_node = "insert_node".asInstanceOf[insert_node]
  
  @js.native
  sealed trait insert_text extends StObject
  inline def insert_text: insert_text = "insert_text".asInstanceOf[insert_text]
  
  @js.native
  sealed trait inward
    extends StObject
       with RangeDirection
  inline def inward: inward = "inward".asInstanceOf[inward]
  
  @js.native
  sealed trait line
    extends StObject
       with MoveUnit
       with TextUnit
       with TextUnitAdjustment
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait lowest
    extends StObject
       with MaximizeMode
       with RangeMode
       with SelectionMode
  inline def lowest: lowest = "lowest".asInstanceOf[lowest]
  
  @js.native
  sealed trait merge_node extends StObject
  inline def merge_node: merge_node = "merge_node".asInstanceOf[merge_node]
  
  @js.native
  sealed trait move_node extends StObject
  inline def move_node: move_node = "move_node".asInstanceOf[move_node]
  
  @js.native
  sealed trait offset
    extends StObject
       with MoveUnit
       with TextUnitAdjustment
  inline def offset: offset = "offset".asInstanceOf[offset]
  
  @js.native
  sealed trait outward
    extends StObject
       with RangeDirection
  inline def outward: outward = "outward".asInstanceOf[outward]
  
  @js.native
  sealed trait remove_node extends StObject
  inline def remove_node: remove_node = "remove_node".asInstanceOf[remove_node]
  
  @js.native
  sealed trait remove_text extends StObject
  inline def remove_text: remove_text = "remove_text".asInstanceOf[remove_text]
  
  @js.native
  sealed trait set_node extends StObject
  inline def set_node: set_node = "set_node".asInstanceOf[set_node]
  
  @js.native
  sealed trait set_selection extends StObject
  inline def set_selection: set_selection = "set_selection".asInstanceOf[set_selection]
  
  @js.native
  sealed trait split_node extends StObject
  inline def split_node: split_node = "split_node".asInstanceOf[split_node]
  
  @js.native
  sealed trait start
    extends StObject
       with LeafEdge
       with SelectionEdge
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait text_ extends StObject
  inline def text_ : text_ = "text".asInstanceOf[text_]
  
  @js.native
  sealed trait word
    extends StObject
       with MoveUnit
       with TextUnit
       with TextUnitAdjustment
  inline def word: word = "word".asInstanceOf[word]
}
