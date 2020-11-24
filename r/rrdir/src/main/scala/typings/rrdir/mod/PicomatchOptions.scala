package typings.rrdir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PicomatchOptions extends js.Object {
  
  var basename: js.UndefOr[Boolean] = js.native
  
  var bash: js.UndefOr[Boolean] = js.native
  
  var capture: js.UndefOr[Boolean] = js.native
  
  var contains: js.UndefOr[Boolean] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var dot: js.UndefOr[Boolean] = js.native
  
  var expandRange: js.UndefOr[js.Function2[/* a */ String, /* b */ String, String]] = js.native
  
  var failglob: js.UndefOr[Boolean] = js.native
  
  var fastpaths: js.UndefOr[Boolean] = js.native
  
  var flags: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  var keepQuotes: js.UndefOr[Boolean] = js.native
  
  var literalBrackets: js.UndefOr[Boolean] = js.native
  
  var lookbehinds: js.UndefOr[Boolean] = js.native
  
  var matchBase: js.UndefOr[Boolean] = js.native
  
  var maxLength: js.UndefOr[Boolean] = js.native
  
  var nobrace: js.UndefOr[Boolean] = js.native
  
  var nobracket: js.UndefOr[Boolean] = js.native
  
  var nocase: js.UndefOr[Boolean] = js.native
  
  var nodupes: js.UndefOr[Boolean] = js.native
  
  var noext: js.UndefOr[Boolean] = js.native
  
  var noextglob: js.UndefOr[Boolean] = js.native
  
  var noglobstar: js.UndefOr[Boolean] = js.native
  
  var nonegate: js.UndefOr[Boolean] = js.native
  
  var noquantifiers: js.UndefOr[Boolean] = js.native
  
  var onIgnore: js.UndefOr[
    js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
  ] = js.native
  
  var onMatch: js.UndefOr[
    js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
  ] = js.native
  
  var onResult: js.UndefOr[
    js.Function4[/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any, Unit]
  ] = js.native
  
  var posix: js.UndefOr[Boolean] = js.native
  
  var posixSlashes: js.UndefOr[Boolean] = js.native
  
  var prepend: js.UndefOr[Boolean] = js.native
  
  var regex: js.UndefOr[Boolean] = js.native
  
  var strictBrackets: js.UndefOr[Boolean] = js.native
  
  var strictSlashes: js.UndefOr[Boolean] = js.native
  
  var unescape: js.UndefOr[Boolean] = js.native
  
  var unixify: js.UndefOr[Boolean] = js.native
}
object PicomatchOptions {
  
  @scala.inline
  def apply(): PicomatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicomatchOptions]
  }
  
  @scala.inline
  implicit class PicomatchOptionsOps[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
    
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
    def setBasename(value: Boolean): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    
    @scala.inline
    def setBash(value: Boolean): Self = this.set("bash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBash: Self = this.set("bash", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setExpandRange(value: (/* a */ String, /* b */ String) => String): Self = this.set("expandRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExpandRange: Self = this.set("expandRange", js.undefined)
    
    @scala.inline
    def setFailglob(value: Boolean): Self = this.set("failglob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailglob: Self = this.set("failglob", js.undefined)
    
    @scala.inline
    def setFastpaths(value: Boolean): Self = this.set("fastpaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastpaths: Self = this.set("fastpaths", js.undefined)
    
    @scala.inline
    def setFlags(value: Boolean): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setFormat(value: /* str */ String => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setKeepQuotes(value: Boolean): Self = this.set("keepQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepQuotes: Self = this.set("keepQuotes", js.undefined)
    
    @scala.inline
    def setLiteralBrackets(value: Boolean): Self = this.set("literalBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteralBrackets: Self = this.set("literalBrackets", js.undefined)
    
    @scala.inline
    def setLookbehinds(value: Boolean): Self = this.set("lookbehinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbehinds: Self = this.set("lookbehinds", js.undefined)
    
    @scala.inline
    def setMatchBase(value: Boolean): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Boolean): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    
    @scala.inline
    def setNobracket(value: Boolean): Self = this.set("nobracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNobracket: Self = this.set("nobracket", js.undefined)
    
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    
    @scala.inline
    def setNodupes(value: Boolean): Self = this.set("nodupes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodupes: Self = this.set("nodupes", js.undefined)
    
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    
    @scala.inline
    def setNoextglob(value: Boolean): Self = this.set("noextglob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoextglob: Self = this.set("noextglob", js.undefined)
    
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    
    @scala.inline
    def setNonegate(value: Boolean): Self = this.set("nonegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonegate: Self = this.set("nonegate", js.undefined)
    
    @scala.inline
    def setNoquantifiers(value: Boolean): Self = this.set("noquantifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoquantifiers: Self = this.set("noquantifiers", js.undefined)
    
    @scala.inline
    def setOnIgnore(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = this.set("onIgnore", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnIgnore: Self = this.set("onIgnore", js.undefined)
    
    @scala.inline
    def setOnMatch(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = this.set("onMatch", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnMatch: Self = this.set("onMatch", js.undefined)
    
    @scala.inline
    def setOnResult(value: (/* glob */ js.Any, /* regex */ js.Any, /* input */ js.Any, /* output */ js.Any) => Unit): Self = this.set("onResult", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnResult: Self = this.set("onResult", js.undefined)
    
    @scala.inline
    def setPosix(value: Boolean): Self = this.set("posix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosix: Self = this.set("posix", js.undefined)
    
    @scala.inline
    def setPosixSlashes(value: Boolean): Self = this.set("posixSlashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixSlashes: Self = this.set("posixSlashes", js.undefined)
    
    @scala.inline
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setStrictBrackets(value: Boolean): Self = this.set("strictBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictBrackets: Self = this.set("strictBrackets", js.undefined)
    
    @scala.inline
    def setStrictSlashes(value: Boolean): Self = this.set("strictSlashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSlashes: Self = this.set("strictSlashes", js.undefined)
    
    @scala.inline
    def setUnescape(value: Boolean): Self = this.set("unescape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
    
    @scala.inline
    def setUnixify(value: Boolean): Self = this.set("unixify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnixify: Self = this.set("unixify", js.undefined)
  }
}
