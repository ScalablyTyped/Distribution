organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-de56c8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.0-971e22",
  "org.scalablytyped" %%% "samchon" % "2.1.4-a5e98e",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "sxml" % "1.0.3-64e1bf",
  "org.scalablytyped" %%% "tstl" % "2.3.0-978f41",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-48b69f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        