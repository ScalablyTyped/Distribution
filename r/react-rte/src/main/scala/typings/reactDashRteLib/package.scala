package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRteLib {
  type BlockRenderer = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.ContentBlock */ /* block */ js.Any, 
    java.lang.String
  ]
  type BlockStyleFn = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.ContentBlock */ /* block */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RenderConfig */ js.Any
  ]
  type ChangeHandler = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorValue */ /* value */ js.Any, 
    js.Any
  ]
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EditorState */ /* state */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  ]
  type CustomBlockFn = js.Function1[
    /* element */ reactLib.Element, 
    js.UndefOr[
      scala.Null | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomBlockObject */ js.Any)
    ]
  ]
  type CustomControl = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any) | CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ reactLib.Element, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InlineCreators */ /* inlineCreators */ js.Any, 
    js.UndefOr[
      scala.Null | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Style */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RenderConfig */ js.Any
  ]
  type GetControlState = js.Function1[/* key */ java.lang.String, js.UndefOr[java.lang.String]]
  type SetControlState = js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  type StyleConfigList = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyleConfig */ js.Any
  ]
}
