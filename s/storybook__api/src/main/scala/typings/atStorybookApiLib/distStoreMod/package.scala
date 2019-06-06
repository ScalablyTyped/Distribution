package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStoreMod {
  type CallBack = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ /* s */ js.Any, 
    scala.Unit
  ]
  type GetState = js.Function0[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ js.Any
  ]
  type InputFnPatch = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ /* s */ js.Any, 
    Patch
  ]
  type InputPatch = Patch | InputFnPatch
  type Patch = stdLib.Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ js.Any
  ]
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
}
