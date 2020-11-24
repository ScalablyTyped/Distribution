package typings.quill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClipboardMatcherCallback = js.Function2[
    /* node */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ js.Any
  ]
  
  type ClipboardMatcherNode = java.lang.String | scala.Double
  
  type EditorChangeHandler = js.Function4[
    typings.quill.quillStrings.`text-change` | typings.quill.quillStrings.`selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any) | (/* range */ typings.quill.mod.RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any) | (/* oldRange */ typings.quill.mod.RangeStatic), 
    /* source */ typings.quill.mod.Sources, 
    js.Any
  ]
  
  type SelectionChangeHandler = js.Function3[
    /* range */ typings.quill.mod.RangeStatic, 
    /* oldRange */ typings.quill.mod.RangeStatic, 
    /* source */ typings.quill.mod.Sources, 
    js.Any
  ]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ typings.quill.mod.Sources, 
    js.Any
  ]
}
