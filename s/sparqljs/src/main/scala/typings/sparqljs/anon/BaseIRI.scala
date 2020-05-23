package typings.sparqljs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseIRI extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var prefixes: js.UndefOr[StringDictionary[String]] = js.undefined
}

object BaseIRI {
  @scala.inline
  def apply(baseIRI: String = null, prefixes: StringDictionary[String] = null): BaseIRI = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseIRI]
  }
}

