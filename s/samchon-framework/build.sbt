organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-63cc78"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-d73fe9",
  "org.scalablytyped" %%% "samchon" % "2.1.4-6fa1a7",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "sxml" % "1.0.3-a33dff",
  "org.scalablytyped" %%% "tstl" % "2.1.3-43d407",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-889190")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        