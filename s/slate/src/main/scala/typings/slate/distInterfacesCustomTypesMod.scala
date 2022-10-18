package typings.slate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesCustomTypesMod {
  
  type CustomTypes = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.slate.slateStrings.Editor
    - typings.slate.slateStrings.Element
    - typings.slate.slateStrings.Text
    - typings.slate.slateStrings.Selection
    - typings.slate.slateStrings.Range
    - typings.slate.slateStrings.Point
    - typings.slate.slateStrings.Operation
    - typings.slate.slateStrings.InsertNodeOperation
    - typings.slate.slateStrings.InsertTextOperation
    - typings.slate.slateStrings.MergeNodeOperation
    - typings.slate.slateStrings.MoveNodeOperation
    - typings.slate.slateStrings.RemoveNodeOperation
    - typings.slate.slateStrings.RemoveTextOperation
    - typings.slate.slateStrings.SetNodeOperation
    - typings.slate.slateStrings.SetSelectionOperation
    - typings.slate.slateStrings.SplitNodeOperation
  */
  trait ExtendableTypes extends StObject
  object ExtendableTypes {
    
    inline def Editor: typings.slate.slateStrings.Editor = "Editor".asInstanceOf[typings.slate.slateStrings.Editor]
    
    inline def Element: typings.slate.slateStrings.Element = "Element".asInstanceOf[typings.slate.slateStrings.Element]
    
    inline def InsertNodeOperation: typings.slate.slateStrings.InsertNodeOperation = "InsertNodeOperation".asInstanceOf[typings.slate.slateStrings.InsertNodeOperation]
    
    inline def InsertTextOperation: typings.slate.slateStrings.InsertTextOperation = "InsertTextOperation".asInstanceOf[typings.slate.slateStrings.InsertTextOperation]
    
    inline def MergeNodeOperation: typings.slate.slateStrings.MergeNodeOperation = "MergeNodeOperation".asInstanceOf[typings.slate.slateStrings.MergeNodeOperation]
    
    inline def MoveNodeOperation: typings.slate.slateStrings.MoveNodeOperation = "MoveNodeOperation".asInstanceOf[typings.slate.slateStrings.MoveNodeOperation]
    
    inline def Operation: typings.slate.slateStrings.Operation = "Operation".asInstanceOf[typings.slate.slateStrings.Operation]
    
    inline def Point: typings.slate.slateStrings.Point = "Point".asInstanceOf[typings.slate.slateStrings.Point]
    
    inline def Range: typings.slate.slateStrings.Range = "Range".asInstanceOf[typings.slate.slateStrings.Range]
    
    inline def RemoveNodeOperation: typings.slate.slateStrings.RemoveNodeOperation = "RemoveNodeOperation".asInstanceOf[typings.slate.slateStrings.RemoveNodeOperation]
    
    inline def RemoveTextOperation: typings.slate.slateStrings.RemoveTextOperation = "RemoveTextOperation".asInstanceOf[typings.slate.slateStrings.RemoveTextOperation]
    
    inline def Selection: typings.slate.slateStrings.Selection = "Selection".asInstanceOf[typings.slate.slateStrings.Selection]
    
    inline def SetNodeOperation: typings.slate.slateStrings.SetNodeOperation = "SetNodeOperation".asInstanceOf[typings.slate.slateStrings.SetNodeOperation]
    
    inline def SetSelectionOperation: typings.slate.slateStrings.SetSelectionOperation = "SetSelectionOperation".asInstanceOf[typings.slate.slateStrings.SetSelectionOperation]
    
    inline def SplitNodeOperation: typings.slate.slateStrings.SplitNodeOperation = "SplitNodeOperation".asInstanceOf[typings.slate.slateStrings.SplitNodeOperation]
    
    inline def Text: typings.slate.slateStrings.Text = "Text".asInstanceOf[typings.slate.slateStrings.Text]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    unknown extends slate.slate/dist/interfaces/custom-types.CustomTypes[K] ? B : slate.slate/dist/interfaces/custom-types.CustomTypes[K]
    }}}
    */
  @js.native
  trait ExtendedType[K /* <: ExtendableTypes */, B] extends StObject
}
