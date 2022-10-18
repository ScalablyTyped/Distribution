package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
  }}}
  */
@js.native
trait ComponentPropsWithRef[T /* <: ElementType[Any] */] extends StObject
