package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends react.react.JSXElementConstructor<infer P> ? P : T extends keyof react.react.JSX.IntrinsicElements ? react.react.JSX.IntrinsicElements[T] : {}
  }}}
  */
@js.native
trait ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.react.reactStrings.a_, typings.react.reactStrings.abbr, typings.react.reactStrings.address */ Any */] extends StObject
