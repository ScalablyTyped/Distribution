package typings
package replacestreamLib.replacestreamMod.ReplaceStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * The text encoding used during search and replace.
           *
           * Default: `"utf8"`
           */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When doing string match (not relevant for regex matching) whether to do a
           * case insensitive search.
           *
           * Default: `true`
           */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Sets a limit on the number of times the replacement will be made. This
           * is forced to one when a regex without the global flag is provided.
           *
           * Default: `Infinity`
           */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
           * When doing cross-chunk replacing, this sets the maximum length match
           * that will be supported.
           *
           * Default: `100`
           */
  var maxMatchLen: js.UndefOr[scala.Double] = js.undefined
  /**
           * When provided, these flags will be used when creating the search regexes
           * internally.
           *
           * @deprecated as the flags set on the regex provided are no longer mutated
           * if this is not provided.
           */
  var regExpOptions: js.UndefOr[java.lang.String] = js.undefined
}

