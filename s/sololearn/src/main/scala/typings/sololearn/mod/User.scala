package typings.sololearn.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /**
    * An array of the user's badges where each badge is a `string`.
    * The array is sorted by when the user recieved the badge, the last item in the array is the first badge they got, the first item in the array is their latest badge
    */
  var badges: js.Array[Badge] = js.native
  
  /** An array of the user's certificates, where each certificate is a `string` which is the name of the course the certificate is associated to */
  var certificates: js.Array[CourseName] = js.native
  
  /** An array of the user's codes ordered descendingly by the number of upvotes the code has, this will only return public codes */
  var codes: js.Array[Code] = js.native
  
  /** An object where the property is the name of the course (see all course names [here](https://github.com/sololearnts/sololearn#coursename)) */
  var courses: /** The name of the course */
  StringDictionary[Course] = js.native
  
  /** The user's ID */
  var id: Double = js.native
  
  /** The level the user is on */
  var level: Double = js.native
  
  /** The user's name */
  var name: String = js.native
  
  /** The user's overall status */
  var status: Status = js.native
  
  /** The amount of XP the user has */
  var xp: Double = js.native
}
object User {
  
  @scala.inline
  def apply(
    badges: js.Array[Badge],
    certificates: js.Array[CourseName],
    codes: js.Array[Code],
    courses: /** The name of the course */
  StringDictionary[Course],
    id: Double,
    level: Double,
    name: String,
    xp: Double
  ): User = {
    val __obj = js.Dynamic.literal(badges = badges.asInstanceOf[js.Any], certificates = certificates.asInstanceOf[js.Any], codes = codes.asInstanceOf[js.Any], courses = courses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setBadgesVarargs(value: Badge*): Self = this.set("badges", js.Array(value :_*))
    
    @scala.inline
    def setBadges(value: js.Array[Badge]): Self = this.set("badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesVarargs(value: CourseName*): Self = this.set("certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: js.Array[CourseName]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodesVarargs(value: Code*): Self = this.set("codes", js.Array(value :_*))
    
    @scala.inline
    def setCodes(value: js.Array[Code]): Self = this.set("codes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourses(value: /** The name of the course */
    StringDictionary[Course]): Self = this.set("courses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXp(value: Double): Self = this.set("xp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
