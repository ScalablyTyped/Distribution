package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.storybookReactDomShim.anon.Disable
import typings.storybookReactDomShim.anon.Name
import typings.storybookReactDomShim.anon.Title
import typings.storybookReactDomShim.distPresetMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def viteFinal(config: Any, options: Options): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("viteFinal")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def webpackFinal(config: Any, options: Options): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("webpackFinal")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

/**
  * ⚠️ This file contains internal WIP types they MUST NOT be exported outside this package for now!
  */
/* Rewritten from type alias, can be one of: 
  - typings.storybookReactDomShim.storybookReactDomShimStrings.webpack5
  - typings.storybookReactDomShim.storybookReactDomShimStrings.`@storybookSlashbuilder-webpack5`
  - java.lang.String
*/
type BuilderName = _BuilderName | String

type CoreCommonStorybookRefs = Record[String, Title | Disable]

/**
  * An additional script that gets injected into the
  * preview or the manager,
  */
type Entry = String

/**
Allows creating a union type by combining primitive types and literal types without sacrificing auto-completion in IDEs for the literal type part of the union.
Currently, when a union type of a primitive type is combined with literal types, TypeScript loses all information about the combined literals. Thus, when such type is used in an IDE with autocompletion, no suggestions are made for the declared literals.
This type is a workaround for [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729). It will be removed as soon as it's not needed anymore.
@example
```
import type {LiteralUnion} from 'type-fest';
// Before
type Pet = 'dog' | 'cat' | string;
const pet: Pet = '';
// Start typing in your TypeScript-enabled IDE.
// You **will not** get auto-completion for `dog` and `cat` literals.
// After
type Pet2 = LiteralUnion<'dog' | 'cat', string>;
const pet: Pet2 = '';
// You **will** get auto-completion for `dog` and `cat` literals.
```
@category Type
*/
type LiteralUnion[LiteralType, BaseType /* <: Primitive */] = LiteralType | (BaseType & (Record[scala.Nothing, scala.Nothing]))

type PackageJson = PackageJson1 & (Record[String, Any])

type Parameters = StringDictionary[Any]

type Preset = String | Name

type PresetValue[T] = T | (js.Function2[/* config */ T, /* options */ Options, T | js.Promise[T]])

/**
Matches any [primitive value](https://developer.mozilla.org/en-US/docs/Glossary/Primitive).
@category Type
*/
type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]

type RendererName = String

type StoriesEntry = String | StoriesSpecifier

type Tag = String
