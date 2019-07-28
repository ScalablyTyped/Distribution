package typings.scopedDashRegex.scopedDashRegexMod

import typings.scopedDashRegex.Anon_Default
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scoped-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function scopedRegex(options?: scopedRegex.Options): RegExp;
  // export = scopedRegex;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Regular expression for matching [scoped npm package names](https://docs.npmjs.com/misc/scope).
  	@returns A `RegExp` for matching scoped package names.
  	@example
  	```
  	import scopedRegex = require('scoped-regex');
  	scopedRegex({exact: true}).test('@sindresorhus/df');
  	//=> true
  	'foo @sindresorhus/df bar'.match(scopedRegex());
  	//=> ['@sindresorhus/df']
  	```
  	*/
  def apply(): RegExp = js.native
  def apply(options: Options): RegExp = js.native
  /**
  	Regular expression for matching [scoped npm package names](https://docs.npmjs.com/misc/scope).
  	@returns A `RegExp` for matching scoped package names.
  	@example
  	```
  	import scopedRegex = require('scoped-regex');
  	scopedRegex({exact: true}).test('@sindresorhus/df');
  	//=> true
  	'foo @sindresorhus/df bar'.match(scopedRegex());
  	//=> ['@sindresorhus/df']
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function scopedRegex(options?: scopedRegex.Options): RegExp;
  // export = scopedRegex;
  def default(): RegExp = js.native
  def default(options: Options): RegExp = js.native
}

