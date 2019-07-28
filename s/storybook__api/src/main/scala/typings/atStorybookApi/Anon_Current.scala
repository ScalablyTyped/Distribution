package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var current: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any
  ] = js.undefined
  var latest: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any
  ] = js.undefined
  var next: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any
  ] = js.undefined
}

object Anon_Current {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[StringDictionary[js.Any]] = null,
    current: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any = null,
    latest: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any = null,
    next: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/versions.Version */ js.Any = null
  ): Anon_Current = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (current != null) __obj.updateDynamic("current")(current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Current]
  }
}

