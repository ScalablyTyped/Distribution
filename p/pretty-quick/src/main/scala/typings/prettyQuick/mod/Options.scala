package typings.prettyQuick.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.mod.ResolveConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends // ...args support
/* key */ StringDictionary[js.Any] {
  
  var bail: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 'master' | 'default'
    */
  var branch: js.UndefOr[String] = js.native
  
  var check: js.UndefOr[Boolean] = js.native
  
  var config: js.UndefOr[ResolveConfigOptions] = js.native
  
  var onCheckFile: js.UndefOr[js.Function2[/* file */ String, /* isFormatted */ Boolean, Unit]] = js.native
  
  var onExamineFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  
  var onFoundChangedFiles: js.UndefOr[js.Function1[/* changedFiles */ js.Array[String], Unit]] = js.native
  
  var onFoundSinceRevision: js.UndefOr[js.Function2[/* name */ String, /* revision */ String, Unit]] = js.native
  
  var onPartiallyStagedFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  
  var onWriteFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
  
  var pattern: js.UndefOr[String | js.Array[String]] = js.native
  
  /** @default true */
  var restage: js.UndefOr[Boolean] = js.native
  
  var since: js.UndefOr[String] = js.native
  
  /** @default false */
  var staged: js.UndefOr[Boolean] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setConfig(value: ResolveConfigOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setOnCheckFile(value: (/* file */ String, /* isFormatted */ Boolean) => Unit): Self = this.set("onCheckFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCheckFile: Self = this.set("onCheckFile", js.undefined)
    
    @scala.inline
    def setOnExamineFile(value: /* file */ String => Unit): Self = this.set("onExamineFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExamineFile: Self = this.set("onExamineFile", js.undefined)
    
    @scala.inline
    def setOnFoundChangedFiles(value: /* changedFiles */ js.Array[String] => Unit): Self = this.set("onFoundChangedFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFoundChangedFiles: Self = this.set("onFoundChangedFiles", js.undefined)
    
    @scala.inline
    def setOnFoundSinceRevision(value: (/* name */ String, /* revision */ String) => Unit): Self = this.set("onFoundSinceRevision", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFoundSinceRevision: Self = this.set("onFoundSinceRevision", js.undefined)
    
    @scala.inline
    def setOnPartiallyStagedFile(value: /* file */ String => Unit): Self = this.set("onPartiallyStagedFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPartiallyStagedFile: Self = this.set("onPartiallyStagedFile", js.undefined)
    
    @scala.inline
    def setOnWriteFile(value: /* file */ String => Unit): Self = this.set("onWriteFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWriteFile: Self = this.set("onWriteFile", js.undefined)
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = this.set("pattern", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: String | js.Array[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setRestage(value: Boolean): Self = this.set("restage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestage: Self = this.set("restage", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setStaged(value: Boolean): Self = this.set("staged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaged: Self = this.set("staged", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
