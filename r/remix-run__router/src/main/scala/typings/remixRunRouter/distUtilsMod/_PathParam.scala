package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  Path extends / * template literal string: ${inferL}/${inferR} * / string ? @remix-run/router.@remix-run/router/dist/utils._PathParam</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any> | @remix-run/router.@remix-run/router/dist/utils._PathParam</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : Path extends / * template literal string: :${inferParam} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Param * / any extends / * template literal string: ${inferOptional}? * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Optional * / any : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Param * / any : never
  }}}
  */
@js.native
trait _PathParam[Path /* <: String */] extends StObject
