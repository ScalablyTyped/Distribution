package typings.slateReact

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsDiffTextMod {
  
  @JSImport("slate-react/dist/utils/diff-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeStringDiffs(targetText: String, a: StringDiff, b: StringDiff): StringDiff | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStringDiffs")(targetText.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[StringDiff | Null]
  
  inline def normalizePoint(editor: Editor, point: Point): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizePoint")(editor.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  inline def normalizeRange(editor: Editor, range: Range): Range | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Range | Null]
  
  inline def normalizeStringDiff(targetText: String, diff: StringDiff): StringDiff | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStringDiff")(targetText.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[StringDiff | Null]
  
  inline def targetRange(textDiff: TextDiff): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("targetRange")(textDiff.asInstanceOf[js.Any]).asInstanceOf[Range]
  
  inline def transformPendingPoint(editor: Editor, point: Point, op: Operation): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPendingPoint")(editor.asInstanceOf[js.Any], point.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  inline def transformPendingRange(editor: Editor, range: Range, op: Operation): Range | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPendingRange")(editor.asInstanceOf[js.Any], range.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[Range | Null]
  
  inline def transformTextDiff(textDiff: TextDiff, op: Operation): TextDiff | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTextDiff")(textDiff.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[TextDiff | Null]
  
  inline def verifyDiffState(editor: Editor, textDiff: TextDiff): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyDiffState")(editor.asInstanceOf[js.Any], textDiff.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait StringDiff extends StObject {
    
    var end: Double
    
    var start: Double
    
    var text: String
  }
  object StringDiff {
    
    inline def apply(end: Double, start: Double, text: String): StringDiff = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringDiff]
    }
    
    extension [Self <: StringDiff](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDiff extends StObject {
    
    var diff: StringDiff
    
    var id: Double
    
    var path: Path
  }
  object TextDiff {
    
    inline def apply(diff: StringDiff, id: Double, path: Path): TextDiff = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDiff]
    }
    
    extension [Self <: TextDiff](x: Self) {
      
      inline def setDiff(value: StringDiff): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
