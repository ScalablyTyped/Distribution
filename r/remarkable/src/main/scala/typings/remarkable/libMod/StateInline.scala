package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateInline extends js.Object {
  
  var env: Env = js.native
  
  /** Set true when seek link label */
  var isInLabel: Boolean = js.native
  
  /**
    * Track unpaired `[` for link labels.
    */
  var labelUnmatchedScopes: Double = js.native
  
  var level: Double = js.native
  
  /**
    * Temporary storage for link url.
    */
  var linkContent: String = js.native
  
  /**
    * Increment for each nesting link.
    * Used to prevent nesting in definitions.
    */
  var linkLevel: Double = js.native
  
  var parser: ParserInline = js.native
  
  var pending: String = js.native
  
  var pendingLevel: Double = js.native
  
  var pos: Double = js.native
  
  var posMax: Double = js.native
  
  def push(token: ContentToken): Unit = js.native
  
  def pushPending(): Unit = js.native
  
  var src: String = js.native
  
  var tokens: js.Array[ContentToken] = js.native
}
object StateInline {
  
  @scala.inline
  def apply(
    env: Env,
    isInLabel: Boolean,
    labelUnmatchedScopes: Double,
    level: Double,
    linkContent: String,
    linkLevel: Double,
    parser: ParserInline,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: ContentToken => Unit,
    pushPending: () => Unit,
    src: String,
    tokens: js.Array[ContentToken]
  ): StateInline = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], isInLabel = isInLabel.asInstanceOf[js.Any], labelUnmatchedScopes = labelUnmatchedScopes.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkLevel = linkLevel.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), pushPending = js.Any.fromFunction0(pushPending), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInline]
  }
  
  @scala.inline
  implicit class StateInlineOps[Self <: StateInline] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: Env): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInLabel(value: Boolean): Self = this.set("isInLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUnmatchedScopes(value: Double): Self = this.set("labelUnmatchedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkContent(value: String): Self = this.set("linkContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLevel(value: Double): Self = this.set("linkLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParser(value: ParserInline): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingLevel(value: Double): Self = this.set("pendingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosMax(value: Double): Self = this.set("posMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: ContentToken => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushPending(value: () => Unit): Self = this.set("pushPending", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: ContentToken*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[ContentToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
