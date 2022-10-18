package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Examples:
  * "/a/b/ *" -> "*"
  * ":a" -> "a"
  * "/a/:b" -> "b"
  * "/a/blahblahblah:b" -> "b"
  * "/:a/:b" -> "a" | "b"
  * "/:a/b/:c/ *" -> "a" | "c" | "*"
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Path extends '*' ? '*' : Path extends / * template literal string: ${inferRest}/ * * / string ? '*' | @remix-run/router.@remix-run/router/dist/utils._PathParam</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : @remix-run/router.@remix-run/router/dist/utils._PathParam<Path>
  }}}
  */
@js.native
trait PathParam[Path /* <: String */] extends StObject
