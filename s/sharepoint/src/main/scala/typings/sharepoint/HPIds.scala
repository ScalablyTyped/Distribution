package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPIds extends js.Object {
  var actions: String = js.native
  var arrow: String = js.native
  var arrowBorder: String = js.native
  var author: String = js.native
  var body: String = js.native
  var close: String = js.native
  var content: String = js.native
  var dateCreated: String = js.native
  var dimensions: String = js.native
  var fileType: String = js.native
  var follow: String = js.native
  var header: String = js.native
  var inner: String = js.native
  var modifiedDate: String = js.native
  var noData: String = js.native
  var open: String = js.native
  var openClient: String = js.native
  var parentLink: String = js.native
  var peopleInterests: String = js.native
  var peopleMemberships: String = js.native
  var peoplePastProjects: String = js.native
  var peopleSchools: String = js.native
  var peopleSkills: String = js.native
  var peopleSummary: String = js.native
  var post: String = js.native
  var preview: String = js.native
  var sectionName: String = js.native
  var send: String = js.native
  var siteDescription: String = js.native
  var siteLogo: String = js.native
  var size: String = js.native
  var summary: String = js.native
  var title: String = js.native
  var viewDuplicates: String = js.native
  var viewer: String = js.native
  var viewsLifeTime: String = js.native
  var viewsRecent: String = js.native
}

object HPIds {
  @scala.inline
  def apply(
    actions: String,
    arrow: String,
    arrowBorder: String,
    author: String,
    body: String,
    close: String,
    content: String,
    dateCreated: String,
    dimensions: String,
    fileType: String,
    follow: String,
    header: String,
    inner: String,
    modifiedDate: String,
    noData: String,
    open: String,
    openClient: String,
    parentLink: String,
    peopleInterests: String,
    peopleMemberships: String,
    peoplePastProjects: String,
    peopleSchools: String,
    peopleSkills: String,
    peopleSummary: String,
    post: String,
    preview: String,
    sectionName: String,
    send: String,
    siteDescription: String,
    siteLogo: String,
    size: String,
    summary: String,
    title: String,
    viewDuplicates: String,
    viewer: String,
    viewsLifeTime: String,
    viewsRecent: String
  ): HPIds = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], arrow = arrow.asInstanceOf[js.Any], arrowBorder = arrowBorder.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], openClient = openClient.asInstanceOf[js.Any], parentLink = parentLink.asInstanceOf[js.Any], peopleInterests = peopleInterests.asInstanceOf[js.Any], peopleMemberships = peopleMemberships.asInstanceOf[js.Any], peoplePastProjects = peoplePastProjects.asInstanceOf[js.Any], peopleSchools = peopleSchools.asInstanceOf[js.Any], peopleSkills = peopleSkills.asInstanceOf[js.Any], peopleSummary = peopleSummary.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], sectionName = sectionName.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any], siteDescription = siteDescription.asInstanceOf[js.Any], siteLogo = siteLogo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], viewDuplicates = viewDuplicates.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewsLifeTime = viewsLifeTime.asInstanceOf[js.Any], viewsRecent = viewsRecent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPIds]
  }
  @scala.inline
  implicit class HPIdsOps[Self <: HPIds] (val x: Self) extends AnyVal {
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
    def setActions(value: String): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrow(value: String): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowBorder(value: String): Self = this.set("arrowBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreated(value: String): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollow(value: String): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setInner(value: String): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenClient(value: String): Self = this.set("openClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentLink(value: String): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleInterests(value: String): Self = this.set("peopleInterests", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleMemberships(value: String): Self = this.set("peopleMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeoplePastProjects(value: String): Self = this.set("peoplePastProjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleSchools(value: String): Self = this.set("peopleSchools", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleSkills(value: String): Self = this.set("peopleSkills", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleSummary(value: String): Self = this.set("peopleSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: String): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionName(value: String): Self = this.set("sectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteDescription(value: String): Self = this.set("siteDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteLogo(value: String): Self = this.set("siteLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewDuplicates(value: String): Self = this.set("viewDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewer(value: String): Self = this.set("viewer", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewsLifeTime(value: String): Self = this.set("viewsLifeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewsRecent(value: String): Self = this.set("viewsRecent", value.asInstanceOf[js.Any])
  }
  
}

