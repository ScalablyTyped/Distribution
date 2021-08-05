package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateInline extends StObject {
  
  var env: Env
  
  /** Set true when seek link label */
  var isInLabel: Boolean
  
  /**
    * Track unpaired `[` for link labels.
    */
  var labelUnmatchedScopes: Double
  
  var level: Double
  
  /**
    * Temporary storage for link url.
    */
  var linkContent: String
  
  /**
    * Increment for each nesting link.
    * Used to prevent nesting in definitions.
    */
  var linkLevel: Double
  
  var parser: ParserInline
  
  var pending: String
  
  var pendingLevel: Double
  
  var pos: Double
  
  var posMax: Double
  
  def push(token: ContentToken): Unit
  
  def pushPending(): Unit
  
  var src: String
  
  var tokens: js.Array[ContentToken]
}
object StateInline {
  
  inline def apply(
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
  
  extension [Self <: StateInline](x: Self) {
    
    inline def setEnv(value: Env): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setIsInLabel(value: Boolean): Self = StObject.set(x, "isInLabel", value.asInstanceOf[js.Any])
    
    inline def setLabelUnmatchedScopes(value: Double): Self = StObject.set(x, "labelUnmatchedScopes", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLinkContent(value: String): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
    
    inline def setLinkLevel(value: Double): Self = StObject.set(x, "linkLevel", value.asInstanceOf[js.Any])
    
    inline def setParser(value: ParserInline): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingLevel(value: Double): Self = StObject.set(x, "pendingLevel", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosMax(value: Double): Self = StObject.set(x, "posMax", value.asInstanceOf[js.Any])
    
    inline def setPush(value: ContentToken => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushPending(value: () => Unit): Self = StObject.set(x, "pushPending", js.Any.fromFunction0(value))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[ContentToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: ContentToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
