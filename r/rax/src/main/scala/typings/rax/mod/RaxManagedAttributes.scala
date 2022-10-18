package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  C extends {  propTypes :infer T,   defaultProps :infer D} ? rax.rax.Defaultize<rax.rax.MergePropTypes<P, prop-types.prop-types.InferProps<T>>, D> : C extends {  propTypes :infer T} ? rax.rax.MergePropTypes<P, prop-types.prop-types.InferProps<T>> : C extends {  defaultProps :infer D} ? rax.rax.Defaultize<P, D> : P
  }}}
  */
@js.native
trait RaxManagedAttributes[C, P] extends StObject
