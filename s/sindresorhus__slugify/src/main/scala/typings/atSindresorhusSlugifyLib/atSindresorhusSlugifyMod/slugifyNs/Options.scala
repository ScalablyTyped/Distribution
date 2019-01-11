package typings
package atSindresorhusSlugifyLib.atSindresorhusSlugifyMod.slugifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Specifying this only replaces the default if you set an item with the same key, like &.
    * The replacements are run on the original string before any other transformations.
    *
    * Add a leading and trailing space to the replacement to have it separated by dashes.
    *
    * @default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
    */
  var customReplacements: js.UndefOr[js.Array[js.Tuple2[java.lang.String, java.lang.String]]] = js.undefined
  /**
    * Convert camelcase to separate words. Internally it does `fooBar` → `foo bar`.
    * @default true
    */
  var decamelize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make the slug lowercase.
    * @default true
    */
  var lowercase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default "-"
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

