package typings.reactPopper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Modifier[Name, Options /* <: js.Object */] = (typings.std.Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifier<Name, Options> */ js.Any
  ]) | typings.reactPopper.mod.StrictModifier[Name]
  type StrictModifier[Name /* <: typings.reactPopper.mod.StrictModifierNames */] = typings.reactPopper.mod.UnionWhere[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers */ js.Any, 
    typings.reactPopper.anon.`0`[Name]
  ]
  type StrictModifierNames = typings.std.NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers * / any['name'] */ js.Any
  ]
  // Utility type
  type UnionWhere[U, M] = U
}
