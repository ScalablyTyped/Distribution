package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuneDto extends js.Object {
  var colloq: String = js.native
  var consumeOnFull: Boolean = js.native
  var consumed: Boolean = js.native
  var depth: Double = js.native
  var description: String = js.native
  var from: js.Array[String] = js.native
  var group: String = js.native
  var hideFromAll: Boolean = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var inStore: Boolean = js.native
  var into: js.Array[String] = js.native
  var maps: js.Array[StringDictionary[Boolean]] = js.native
  var name: String = js.native
  var plaintext: String = js.native
  var requiredChampion: String = js.native
  var rune: MetaDataDto = js.native
  var sanitizedDescription: String = js.native
  var specialRecipe: Double = js.native
  var stacks: Double = js.native
  var stats: BasicDataStatsDto = js.native
  var tags: js.Array[String] = js.native
}

object RuneDto {
  @scala.inline
  def apply(
    colloq: String,
    consumeOnFull: Boolean,
    consumed: Boolean,
    depth: Double,
    description: String,
    from: js.Array[String],
    group: String,
    hideFromAll: Boolean,
    id: Double,
    image: ImageDto,
    inStore: Boolean,
    into: js.Array[String],
    maps: js.Array[StringDictionary[Boolean]],
    name: String,
    plaintext: String,
    requiredChampion: String,
    rune: MetaDataDto,
    sanitizedDescription: String,
    specialRecipe: Double,
    stacks: Double,
    stats: BasicDataStatsDto,
    tags: js.Array[String]
  ): RuneDto = {
    val __obj = js.Dynamic.literal(colloq = colloq.asInstanceOf[js.Any], consumeOnFull = consumeOnFull.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], hideFromAll = hideFromAll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inStore = inStore.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], requiredChampion = requiredChampion.asInstanceOf[js.Any], rune = rune.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], specialRecipe = specialRecipe.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneDto]
  }
  @scala.inline
  implicit class RuneDtoOps[Self <: RuneDto] (val x: Self) extends AnyVal {
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
    def setColloq(value: String): Self = this.set("colloq", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumeOnFull(value: Boolean): Self = this.set("consumeOnFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumed(value: Boolean): Self = this.set("consumed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromVarargs(value: String*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[String]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideFromAll(value: Boolean): Self = this.set("hideFromAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: ImageDto): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInStore(value: Boolean): Self = this.set("inStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntoVarargs(value: String*): Self = this.set("into", js.Array(value :_*))
    @scala.inline
    def setInto(value: js.Array[String]): Self = this.set("into", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapsVarargs(value: StringDictionary[Boolean]*): Self = this.set("maps", js.Array(value :_*))
    @scala.inline
    def setMaps(value: js.Array[StringDictionary[Boolean]]): Self = this.set("maps", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredChampion(value: String): Self = this.set("requiredChampion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRune(value: MetaDataDto): Self = this.set("rune", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanitizedDescription(value: String): Self = this.set("sanitizedDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecialRecipe(value: Double): Self = this.set("specialRecipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setStacks(value: Double): Self = this.set("stacks", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: BasicDataStatsDto): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

