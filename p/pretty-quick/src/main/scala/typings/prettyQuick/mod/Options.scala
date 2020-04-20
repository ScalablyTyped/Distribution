package typings.prettyQuick.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.mod.ResolveConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends // ...args support
/* key */ StringDictionary[js.Any] {
  var bail: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 'master' | 'default'
    */
  var branch: js.UndefOr[String] = js.undefined
  var check: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[ResolveConfigOptions] = js.undefined
  var onCheckFile: js.UndefOr[js.Function2[/* file */ String, /* isFormatted */ Boolean, Unit]] = js.undefined
  var onExamineFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
  var onFoundChangedFiles: js.UndefOr[js.Function1[/* changedFiles */ js.Array[String], Unit]] = js.undefined
  var onFoundSinceRevision: js.UndefOr[js.Function2[/* name */ String, /* revision */ String, Unit]] = js.undefined
  var onPartiallyStagedFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
  var onWriteFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
  var pattern: js.UndefOr[String | js.Array[String]] = js.undefined
  /** @default true */
  var restage: js.UndefOr[Boolean] = js.undefined
  var since: js.UndefOr[String] = js.undefined
  /** @default false */
  var staged: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: // ...args support
  /* key */ StringDictionary[js.Any] = null,
    bail: js.UndefOr[Boolean] = js.undefined,
    branch: String = null,
    check: js.UndefOr[Boolean] = js.undefined,
    config: ResolveConfigOptions = null,
    onCheckFile: (/* file */ String, /* isFormatted */ Boolean) => Unit = null,
    onExamineFile: /* file */ String => Unit = null,
    onFoundChangedFiles: /* changedFiles */ js.Array[String] => Unit = null,
    onFoundSinceRevision: (/* name */ String, /* revision */ String) => Unit = null,
    onPartiallyStagedFile: /* file */ String => Unit = null,
    onWriteFile: /* file */ String => Unit = null,
    pattern: String | js.Array[String] = null,
    restage: js.UndefOr[Boolean] = js.undefined,
    since: String = null,
    staged: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (onCheckFile != null) __obj.updateDynamic("onCheckFile")(js.Any.fromFunction2(onCheckFile))
    if (onExamineFile != null) __obj.updateDynamic("onExamineFile")(js.Any.fromFunction1(onExamineFile))
    if (onFoundChangedFiles != null) __obj.updateDynamic("onFoundChangedFiles")(js.Any.fromFunction1(onFoundChangedFiles))
    if (onFoundSinceRevision != null) __obj.updateDynamic("onFoundSinceRevision")(js.Any.fromFunction2(onFoundSinceRevision))
    if (onPartiallyStagedFile != null) __obj.updateDynamic("onPartiallyStagedFile")(js.Any.fromFunction1(onPartiallyStagedFile))
    if (onWriteFile != null) __obj.updateDynamic("onWriteFile")(js.Any.fromFunction1(onWriteFile))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(restage)) __obj.updateDynamic("restage")(restage.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(staged)) __obj.updateDynamic("staged")(staged.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

