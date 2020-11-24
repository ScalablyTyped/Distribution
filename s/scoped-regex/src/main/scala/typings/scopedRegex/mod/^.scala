package typings.scopedRegex.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scoped-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function scopedRegex(options?: scopedRegex.Options): RegExp;
  // export = scopedRegex;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof scopedRegex */ js.Any = js.native
}
