package typings.storybookAddonStoryshots.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typings.storybookAddonStoryshots.storybookAddonStoryshotsStrings.DIR
import typings.storybookAddonStoryshots.storybookAddonStoryshotsStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Absolute extends js.Object {
  var absolute: Boolean = js.native
  var cache: js.UndefOr[StringDictionary[Boolean | js.Array[String] | DIR | FILE]] = js.native
  var cwd: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var flipNegate: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var ignore: js.Array[String] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var matchBase: js.UndefOr[js.Any] = js.native
  var nobrace: js.UndefOr[Boolean] = js.native
  var nocase: js.UndefOr[Boolean] = js.native
  var nocomment: js.UndefOr[Boolean] = js.native
  var nodir: js.UndefOr[Boolean] = js.native
  var noext: js.UndefOr[Boolean] = js.native
  var noglobstar: js.UndefOr[Boolean] = js.native
  var nomount: js.UndefOr[Boolean] = js.native
  var nonegate: js.UndefOr[Boolean] = js.native
  var nonull: js.UndefOr[Boolean] = js.native
  var nosort: js.UndefOr[Boolean] = js.native
  var nounique: js.UndefOr[Boolean] = js.native
  var realpath: js.UndefOr[Boolean] = js.native
  var realpathCache: js.UndefOr[StringDictionary[String]] = js.native
  var root: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stat: js.UndefOr[Boolean] = js.native
  var statCache: js.UndefOr[StringDictionary[`false` | IsDirectory]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var symlinks: js.UndefOr[StringDictionary[Boolean]] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object Absolute {
  @scala.inline
  def apply(absolute: Boolean, ignore: js.Array[String]): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  @scala.inline
  implicit class AbsoluteOps[Self <: Absolute] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: StringDictionary[Boolean | js.Array[String] | DIR | FILE]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
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
    def setFlipNegate(value: Boolean): Self = this.set("flipNegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipNegate: Self = this.set("flipNegate", js.undefined)
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setMatchBase(value: js.Any): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    @scala.inline
    def setNocomment(value: Boolean): Self = this.set("nocomment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocomment: Self = this.set("nocomment", js.undefined)
    @scala.inline
    def setNodir(value: Boolean): Self = this.set("nodir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodir: Self = this.set("nodir", js.undefined)
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    @scala.inline
    def setNomount(value: Boolean): Self = this.set("nomount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNomount: Self = this.set("nomount", js.undefined)
    @scala.inline
    def setNonegate(value: Boolean): Self = this.set("nonegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonegate: Self = this.set("nonegate", js.undefined)
    @scala.inline
    def setNonull(value: Boolean): Self = this.set("nonull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonull: Self = this.set("nonull", js.undefined)
    @scala.inline
    def setNosort(value: Boolean): Self = this.set("nosort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNosort: Self = this.set("nosort", js.undefined)
    @scala.inline
    def setNounique(value: Boolean): Self = this.set("nounique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNounique: Self = this.set("nounique", js.undefined)
    @scala.inline
    def setRealpath(value: Boolean): Self = this.set("realpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    @scala.inline
    def setRealpathCache(value: StringDictionary[String]): Self = this.set("realpathCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealpathCache: Self = this.set("realpathCache", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setStat(value: Boolean): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
    @scala.inline
    def setStatCache(value: StringDictionary[`false` | IsDirectory]): Self = this.set("statCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatCache: Self = this.set("statCache", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setSymlinks(value: StringDictionary[Boolean]): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

