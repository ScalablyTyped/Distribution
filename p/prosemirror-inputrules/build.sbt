organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20200830Z-050b0d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-198c9d",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-059dfc",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20201002Z-c5ffe9",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-1cfba8",
  "org.scalablytyped" %%% "prosemirror-view" % "1.16-dt-20201015Z-d34d02",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
