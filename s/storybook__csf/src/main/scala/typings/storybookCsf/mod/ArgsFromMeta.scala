package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  Meta extends {  render :@storybook/csf.@storybook/csf.ArgsStoryFn<TRenderer, infer RArgs> | undefined,   loaders :std.Array<infer Loaders> | undefined,   decorators :std.Array<infer Decorators> | undefined} ? type-fest.type-fest/source/simplify.Simplify<type-fest.type-fest/source/omit-index-signature.OmitIndexSignature<RArgs & @storybook/csf.@storybook/csf.DecoratorsArgs<TRenderer, Decorators> & @storybook/csf.@storybook/csf.LoaderArgs<TRenderer, Loaders>>> : unknown
  }}}
  */
@js.native
trait ArgsFromMeta[TRenderer /* <: Renderer */, Meta] extends StObject
